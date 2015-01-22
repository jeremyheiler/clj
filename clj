#!/bin/bash

# TODO
#
# - POSIX only?
# - Don't hardcode the location of the Clojure jar
#   - Could have a `-v 1.6.0` so the jar can be downloaded and cached
# - Allow for all of the expected arguments to clojure.main
# - Allow for the classpath to be set as an argument

rlwrap java -cp $HOME/clojure/clojure-1.6.0/clojure-1.6.0.jar clojure.main
