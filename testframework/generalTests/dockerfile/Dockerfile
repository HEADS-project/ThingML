FROM maven:3.3.3-jdk-8
MAINTAINER Anatoly Vasilevskiy <Anatoly.Vasilevskiy@sintef.no>

RUN mkdir workingdir \
	&& apt-get -qq update \
	&& apt-get install --no-install-recommends -qqy \
	sshpass \
    	curl \
    	ca-certificates \
	openssh-server \
	gcc \
	make

RUN curl -sL https://deb.nodesource.com/setup_7.x | bash - \
	&& apt-get install --no-install-recommends -qqy nodejs \
	build-essential

COPY dojob.py workingdir/dojob.py
RUN chmod a+x workingdir/dojob.py
WORKDIR workingdir
