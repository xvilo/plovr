FROM docker.pkg.github.com/plovr/plovr-docker/plovr-docker:docker-base-layer

ADD . /plovr

WORKDIR /plovr

RUN buck fetch //third-party/...

RUN buck test :test
