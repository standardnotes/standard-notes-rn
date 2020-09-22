import { NativeModules } from 'react-native';

const SNReactNative = {
  exitApp: function() {
    NativeModules.SNReactNative.exitApp();
  }
  MANUFACTURER: NativeModules.MANUFACTURER;
};

export default SNReactNative;
