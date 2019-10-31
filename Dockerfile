# Copyright 刘珈奇
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

FROM mysql:latest

LABEL maintainer="Jiaqi (정환) Jack"
LABEL maintainer-email="JiaqiQubit@gmail.com"

# Ubuntu updates
RUN apt-get update
RUN apt-get upgrade -y
RUN apt update
RUN apt upgrade -y

# Java
RUN mkdir -p /usr/share/man/man1
RUN apt-get install openjdk-8-jdk -y
ENV JAVA_HOME /usr/lib/jvm/java-8-openjdk-amd64/jre/

## Auxiliary packages
RUN apt-get install maven -y

# Ship example Elide project into image
RUN mkdir elide-quick
ADD ElideQuick /elide-quick/