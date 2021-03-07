cmake_minimum_required(VERSION 3.4.1)

add_library(hello-jnicallback SHARED
            hello-jnicallback.c)

add_library(test_gen SHARED
        test_gen.c)
# Include libraries needed for hello-jnicallback lib
target_link_libraries(hello-jnicallback
                      android
                      log)
target_link_libraries(test_gen
        android
        log)