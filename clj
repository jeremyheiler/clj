#!/bin/bash

set -e

java -cp $(clj-env path) clojure.main "$@"
