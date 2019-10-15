
FROM docker.pkg.github.com/plovr/plovr-docker/plovr-docker:latest

# Run tests
ADD . /plovr
WORKDIR /plovr
RUN buck fetch //third-party/...

RUN buck test :test
