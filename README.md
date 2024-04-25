# Appium Mobile Automation Testing


### Appium Installation

#### Install Homebrew
```
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
```

#### Install NodeJS
```
brew install node
```

#### Install Appium
```
npm i --location=global appium
 ```

#### Install UiAutomator2 Driver
```
appium driver install uiautomator2
```

#### Check and Run Appium
```
appium
```

### Environment Variable Setup

```
sudo nano ~/.bash_profile
```

Input these lines into `bash_profile`

```
export JAVA_HOME=$(/usr/libexec/java_home)
export MAVEN_HOME=/usr/local/bin/mvn
export M2=$MAVEN_HOME
export ANDROID_HOME=/users/rizky.ashari/Library/Android/sdk
export PATH=$PATH:/usr/local/git/bin:/usr/local/bin:
export PATH=$PATH:$ANDROID_HOME/platform-tools
export PATH=$PATH:$ANDROID_HOME/emulator
```

To prevent Appium Inspector start session failure, need to add command to terminal

```
source ~/.bash_profile
```

Check whether `ANDROID_HOME` already set or not
```
echo $ANDROID_HOME
```
If successful, it will show the path similar to this
```
/users/rizky.ashari/Library/Android/sdk
```


### Apps need to be Installed

#### 1. Android Studio 
   Used for connecting virtual or real Android device. Download link: https://developer.android.com/studio
   
#### 2. XCode
   Used for iOS virtual or real device connection. It can be downloaded here: https://developer.apple.com/xcode/resources/

#### 3. IntelliJ IDEA Community Edition
   IntelliJ IDEA is an Integrated Development Environment (IDE) for Java and Kotlin. It also supports Maven project creation easily. Download link: https://www.jetbrains.com/idea/download/?section=mac

#### 4. Appium Inspector
   Used to inspect mobile application element. Here is the visual of Appium Inspector and example to build Capability Sets.

   ![Appium Inspector Example](https://github.com/rizkyashari/appiumdemo/assets/101076763/84b1afee-cf48-431d-b7e6-d37a70a75e31)
   
   Click "Start Session" after capability sets already saved. Here is the example of successful session.
   
   ![Appium Inspector Session](https://github.com/rizkyashari/appiumdemo/assets/101076763/80b42431-d46b-4826-949e-8bfd9088f0e6)

   Download link: https://github.com/appium/appium-inspector/releases
