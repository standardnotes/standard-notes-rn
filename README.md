# standard-notes-rn

## Setup

```bash
npm install @standardnotes/react-native-utils --save
react-native link @standardnotes/react-native-utils
```

#### iOS
* Add SNReactNative.xcoderproj into your project in the Libraries folder.
* Add the .a file on the General tab of your target under Linked Frameworks And Libraries
* Add the .a file on the Build Phases tab of your target under Link Binary With Libraries

#### Android
* In the settings.gradle
  ```
    include ':@standardnotes/react-native-utils', ':app'
    project(':@standardnotes/react-native-utils').projectDir = new File(rootProject.projectDir, '../node_modules/@standardnotes/react-native-utils/android')
  ```
* In the build.gradle
  ```
    compile project(':@standardnotes/react-native-utils')
  ```
* In MainApplication.java
  ```
    import org.standardnotes.SNReactNative.SNReactNativePackage;
    ...
    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
        ...
        new SNReactNativePackage(),
        ...
      );
    }
    ...
  ```
## Usage

```javascript
import SNReactNative from '@standardnotes/react-native-utils';
...
SNReactNative.exitApp();
...
```
