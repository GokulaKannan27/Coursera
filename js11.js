var names=["Arjun","Kumar","Jaish","Vinoth"];
names.forEach(function(name)
{
    if(name.charAt(0)==='j' ||name.charAt(0)==='J')
    {
        console.log("Goodbye "+name);
    }
    else{
        console.log('Hello '+name);
    }
})