import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
from sklearn.metrics import mean_squared_error

data=pd.read_csv('movies.csv')

#step 4:Split data into train and test sets
x=data.drop('title',axis=10)
y=data['title']
x_train,x_test,y_train,y_test=train_test_split(x,y,test_sizee=0.2,random_state=42)
model=Classfication()

model.fit(x_train,y_train)

train_rmse = mean_squared_error(y_train, model.predict(X_train), squared=False)
test_rmse = mean_squared_error(y_test, model.predict(X_test), squared=False)
print(f"Train RMSE: {train_rmse}")
print(f"Test RMSE: {test_rmse}")

'''import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
from sklearn.metrics import mean_squared_error

# Step 1: Load Your Excel Data
def load_data(file_path):
    return pd.read_excel(file_path)

# Step 2: Preprocess Your Data (if necessary)
# Add preprocessing steps here as needed

# Step 3: Split Data into Training and Testing Sets
def split_data(df, target_column, test_size=0.2):
    X = df.drop(target_column, axis=1)
    y = df[target_column]
    return train_test_split(X, y, test_size=test_size, random_state=42)

# Step 4: Choose a Model
def choose_model():
    return LinearRegression()

# Step 5: Train the Model
def train_model(model, X_train, y_train):
    model.fit(X_train, y_train)

# Step 6: Evaluate the Model
def evaluate_model(model, X_train, y_train, X_test, y_test):
    train_rmse = mean_squared_error(y_train, model.predict(X_train), squared=False)
    test_rmse = mean_squared_error(y_test, model.predict(X_test), squared=False)
    print(f"Train RMSE: {train_rmse}")
    print(f"Test RMSE: {test_rmse}")

# Step 7: Make Predictions (if applicable)
# Add prediction steps here if you want to make predictions with the trained model

if __name__ == "__main__":
    # Step 1: Load Your Excel Data
    file_path = 'movies.zip'
    df = load_data(file_path)

    # Step 3: Split Data into Training and Testing Sets
    target_column = 'title'  # Replace with your target column name
    X_train, X_test, y_train, y_test = split_data(df, target_column)

    # Step 4: Choose a Model
    model = choose_model()

    # Step 5: Train the Model
    train_model(model, X_train, y_train)

    # Step 6: Evaluate the Model
    evaluate_model(model, X_train, y_train, X_test, y_test)

    # Step 7: Make Predictions (if applicable)
    # Add prediction steps here if you want to make predictions with the trained model
'''
