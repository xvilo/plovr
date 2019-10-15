FROM docker.pkg.github.com/plovr/plovr-docker/plovr-docker:latest

ADD . /plovr

WORKDIR /plovr

RUN buck fetch //third-party/...

RUN buck test :test
