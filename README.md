## Breif introduction

This app is mainly built using Kotlin, following the core design principles of Android and adopting the MVVM framework.

## Key Features

- Implemented the app's layouts using Material UI.
- Used DataStore instead of SharedPreferences to save our preferred news sorting option, as DataStore provides an extra layer of security with its EncryptedDataStore module, ensuring the protection of sensitive information.
- As this app follows the MVVM design principle, we've chosen to use a combination of repository, view model, and LiveData for handling API calls, moving away from the older approach of using AsyncTasks and callbacks. This modern approach helps us organize and manage code more effectively.
