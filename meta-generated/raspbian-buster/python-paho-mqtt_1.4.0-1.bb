PACKAGES = "${PN} python3-paho-mqtt"
PROVIDES = "python3-paho-mqtt"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/p/python-paho-mqtt/python3-paho-mqtt_1.4.0-1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_python3-paho-mqtt = "python3-paho-mqtt_1.4.0-1_all.deb"
SRC_URI[deb0.sha256sum] = "041a54d85b1d56a21e05098aebe29a1c021831a95280c15d2ad75a990278918d"
SRC_URI[deb0.md5sum] = "94a184129ac6a71cbd4daab6dc6caae0"

RDEPENDS_python3-paho-mqtt = "python3"
DEPENDS = "python3"


inherit deb_group

FILES_python3-paho-mqtt = " \
    ./usr/lib/python3/dist-packages/paho/__init__.py \
    ./usr/lib/python3/dist-packages/paho/mqtt/__init__.py \
    ./usr/lib/python3/dist-packages/paho/mqtt/client.py \
    ./usr/lib/python3/dist-packages/paho/mqtt/matcher.py \
    ./usr/lib/python3/dist-packages/paho/mqtt/publish.py \
    ./usr/lib/python3/dist-packages/paho/mqtt/subscribe.py \
    ./usr/lib/python3/dist-packages/paho_mqtt-1.4.0.egg-info/PKG-INFO \
    ./usr/lib/python3/dist-packages/paho_mqtt-1.4.0.egg-info/dependency_links.txt \
    ./usr/lib/python3/dist-packages/paho_mqtt-1.4.0.egg-info/not-zip-safe \
    ./usr/lib/python3/dist-packages/paho_mqtt-1.4.0.egg-info/top_level.txt \
    ./usr/share/doc/python3-paho-mqtt/changelog.Debian.gz \
    ./usr/share/doc/python3-paho-mqtt/changelog.gz \
    ./usr/share/doc/python3-paho-mqtt/copyright\
"
