#!/bin/sh

set -e

java -cp $(clj-env path) clojure.main "$@"
