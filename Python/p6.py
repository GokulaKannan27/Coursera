import pandas as pd
from surprise import Reader, Dataset, SVD, accuracy

# Load your movie ratings dataset (replace 'ratings.csv' with your filename)
data = pd.read_csv('movies.csv')

# Create a Surprise Dataset object
reader = Reader(rating_scale=(1, 5))  # Assuming ratings are between 1 and 5
data = Dataset.load_from_df(data[['userId', 'movieId', 'rating']], reader)

# Train a model (SVD in this example)
trainset = data.build_full_trainset()
algo = SVD()
algo.fit(trainset)

# Get user ID for whom you want recommendations (replace with actual ID)
user_id = 123

# Get all ratings for this user
user_ratings = data.ppars['userId'][user_id]

# Get top 10 movie recommendations (excluding those already rated)
predictions = [
    (algo.predict(user_id, rated_item.sid, None).est, rated_item.sid)
    for rated_item in user_ratings
]

predictions.sort(reverse=True)
top_10 = predictions[:10]  # Get top 10 recommendations

# Get movie details (assuming you have a separate movie data file)
movie_data = pd.read_csv('movies.csv')  # Replace with your movie data file

# Merge recommendations with movie data to get movie titles
recommended_movies = movie_data.merge(pd.DataFrame(top_10, columns=['est', 'movieId']), on='movieId')
recommended_movies = recommended_movies[['title', 'est']]  # Select title and estimated rating

print("Top 10 Movie Recommendations for User", user_id)
print(recommended_movies)
