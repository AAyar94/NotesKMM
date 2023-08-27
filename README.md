<div align=center>
  
## Notes App

![Screenshot](https://media.licdn.com/dms/image/C5612AQH-rB_omxafiw/article-cover_image-shrink_720_1280/0/1643210129680?e=2147483647&v=beta&t=6HvNmY1udxoEQMKax6A0DxIIrWPbQrJdyDsQAaQYk5k)

Notes app; **Kotlin**, **SwiftUI**, **Dagger Hilt**, **Coroutines**, **Lifecycle**, **LiveData**, **ViewModel**, **Kotlin Multiplatform Mobile**, **SQLDelight**, **Cocoapods** based on **MVVM** Architecture.

## Architecture 🏛

**Model - View - ViewModel (MVVM)** is the industry recognized software architecture pattern that overcomes all drawbacks of MVP and MVC design patterns. MVVM suggests separating the data presentation logic(Views or UI) from the core business logic part of the application.

**Shared Module**: The Shared module is at the heart of a KMM project, containing the common Kotlin code that is shared across all platforms (Android, iOS). This module typically includes business logic, data models, and utility functions that can be utilized by both Android and iOS platforms. By sharing code in this module, development efficiency is enhanced, as changes made here propagate seamlessly to both platforms.

**Android Module**: The Android module focuses on the Android-specific implementation of the app. It provides the necessary Android-specific code, UI components, and integration points. While the core logic remains in the Shared module, the Android module allows developers to create the user interface and handle platform-specific concerns for the Android app. This module's primary goal is to create a smooth and native-like experience for Android users.

**iOS Module**: Similarly, the iOS module caters to the iOS-specific aspects of the application. It includes code and UI components that are tailored to iOS devices and their user interface paradigms. This module collaborates closely with the Shared module to integrate the common logic while still accommodating platform-specific requirements. This ensures a cohesive user experience for iOS users.

![Screenshot](https://miro.medium.com/v2/resize:fit:1200/1*3XpF4zrIIIZKonQC7uRHAg.jpeg)

</div>

## Libraries 🛠 ⚙️
- [SQLDelight](https://developer.squareup.com/blog/announcing-sqldelight-1-0/) ->  Squareup's SQLDelight library is a powerful tool for Android and Kotlin multiplatform development that generates type-safe APIs and code based on your SQL database schema, ensuring efficient and reliable database interactions.
- [Kotlin](https://github.com/JetBrains/kotlin) -> The Kotlin Programming Language.
- [Coroutines](https://github.com/Kotlin/kotlinx.coroutines) -> Library support for Kotlin coroutines
- [Lifecycle](https://developer.android.com/jetpack/androidx/releases/lifecycle) -> Perform actions in response to a change in the lifecycle status of another component, such as activities and fragments.
- [Dagger Hilt](https://developer.android.com/training/dependency-injection/hilt-android) -> Hilt provides a standard way to incorporate Dagger dependency injection into an Android application.
- [LiveData](https://developer.android.com/topic/libraries/architecture/livedata) -> LiveData is an observable data holder class.
- [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) -> ViewModel class is designed to store and manage UI-related data in a lifecycle conscious way.
- [Cocoapods](https://cocoapods.org) -> CocoaPods is a dependency manager for Swift and Objective-C projects that simplifies the process of integrating and managing third-party libraries, frameworks, and tools within iOS and macOS applications.
- [SwiftUi](https://developer.apple.com/xcode/swiftui/) -> SwiftUI helps you build great-looking apps across all Apple platforms with the power of Swift

## 📱 Application Screens 📸

<img src="https://github.com/AAyar94/NotesKMM/blob/main/screenshots/androidFrame.png" width=500 /><img src="https://github.com/AAyar94/NotesKMM/blob/main/screenshots/iosFrame.png" width=500 />
<div style="display: flex; justify-content: space-between;">
  
<img src="https://github.com/AAyar94/NotesKMM/blob/main/screenshots/androidscreenshot1.png" width="30%" /><img src="https://github.com/AAyar94/NotesKMM/blob/main/screenshots/androidscreenshot2.png" width="30%" /><img src="https://github.com/AAyar94/NotesKMM/blob/main/screenshots/androidscreenshot3.png" width="30%" />
</div>
<div style="display: flex; justify-content: space-between;">
<img src="https://github.com/AAyar94/NotesKMM/blob/main/screenshots/iosscreenshot2.png" width="250" /><img src="https://github.com/AAyar94/NotesKMM/blob/main/screenshots/iosscreenshot3.png" width="250" /><img src="https://github.com/AAyar94/NotesKMM/blob/main/screenshots/iosscreenshot4.png" width="250" />

</div>

## License ℹ️
```
MIT License

Copyright (c) 2023 Adem Ayar

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```

