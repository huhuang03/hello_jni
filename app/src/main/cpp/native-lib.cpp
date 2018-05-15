#include <jni.h> #include "android/log.h"
#include <thread>

extern "C" JNIEXPORT jstring
JNICALL
Java_com_th_jnidebugtest_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}

