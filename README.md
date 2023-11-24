# Android Retrofit API Demo

This Android Kotlin project demonstrates simple API calls using the Retrofit library. The project includes implementations for the following API calls:

- Get a list of posts
- Get a post by its ID
- Create a new post

## Prerequisites

Before running the project, make sure you have the following set up:

- Android Studio installed
- Internet permission added to your AndroidManifest.xml file

## Libraries Used

- Retrofit: [Link to Retrofit Documentation](https://square.github.io/retrofit/)
- RecyclerView: [android-kotlin-recyclerview](https://github.com/dalemncy/android-kotlin-recyclerview)

## API Endpoints

- **Get Post List:** `/api/post`
Example output:
```bash
[
    {
        "id": "3m3NHikj6FxTMG83cYJR",
        "description": "The quick brown fox jumped over the lazy dog. Because its all about the dog!"
    },
    {
        "id": "GCko3aV28C8icVMRAPFf",
        "description": "I know what kind of God i should be for you, for all of us. This is a Loki quote."
    },
    {
        "id": "pl74LaFa9LTSreQvuW0s",
        "description": "We are the world, we are the children, we are the ones who can make a brighter day so lets start giving.",
    }
]
```

- **Get Post by ID:** `/api/post/{id}`
Example output:
```bash
{
    "id": "3m3NHikj6FxTMG83cYJR",
    "description": "The quick brown fox jumped over the lazy dog. Because its all about the dog!"
}
```

- **Create Post:** `/api/post`
Example input:
```bash
{
    "description": "I know what kind of God i should be for you, for all of us."
}
```

## Usage

1. Clone the repository from [GitHub](https://github.com/dalemncy/android-kotlin-retrofit).

2. Open the project in Android Studio.

3. Update the value of `Constants.API` in the `Constants` class with the appropriate API base URL since it is currently empty.

4. Run the app on an emulator or physical device.

5. Explore the code in the following activities:
    - `ListActivity`: Displays a list of posts.
    - `CreatePostActivity`: Allows the user to create a new post.
    - `PostActivity`: Displays details of a specific post.

## Additional Notes

- This is a simple demonstration project and may not cover all edge cases or best practices for a production application.
- The project also makes use of RecyclerViews. For more details on RecyclerView implementation, refer to [android-kotlin-recyclerview](https://github.com/dalemncy/android-kotlin-recyclerview).

## License

This project is licensed under the [MIT License](https://opensource.org/licenses/MIT).
