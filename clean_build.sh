#!/bin/sh
echo "cleaning"
./gradlew clean -q
./gradlew cleanLib -q
echo "building lib"
./gradlew buildLib -q
echo "cleaning "
./gradlew cleanBundle -q
echo "building Bundle"
./gradlew buildBundle -q
# echo "build app debug"
# ./gradlew :app:assembleDebug
# echo "install apk"
# adb install app/build/outputs/apk/app-debug.apk
# echo "open app"
# adb shell am start -n io.github.mayunfei.umengdemo/.LaunchActivity