PACKAGES = "${PN} mosquitto"
PROVIDES = "mosquitto"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/m/mosquitto/mosquitto_1.3.4-2+deb8u4_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_mosquitto = "mosquitto_1.3.4-2+deb8u4_armhf.deb"
SRC_URI[deb0.sha256sum] = "57a05965b7e64cd01c0c11ad93ffb9a0d9ec9b924e4b0fbb471b6055394ee6d2"
SRC_URI[deb0.md5sum] = "15acb1f4583d773ba8114945b71ea92e"

RDEPENDS_${PN} = "adduser (>= 3.10) libc6 (>= 2.4) libssl1.0.0 (>= 1.0.1) libuuid1 libwrap0 (>= 7.6-4~) lsb-base (>= 4.1+Debian3)"
DEPENDS = "adduser libc6 libssl1.0.0 libuuid1 libwrap0 lsb-base"


inherit deb_group

FILES_${PN} = " \
    ./etc/init.d/mosquitto \
    ./etc/init/mosquitto.conf \
    ./etc/logrotate.d/mosquitto \
    ./etc/mosquitto/ca_certificates/README \
    ./etc/mosquitto/certs/README \
    ./etc/mosquitto/conf.d/README \
    ./etc/mosquitto/mosquitto.conf \
    ./usr/bin/mosquitto_passwd \
    ./usr/sbin/mosquitto \
    ./usr/share/doc/mosquitto/changelog.Debian.gz \
    ./usr/share/doc/mosquitto/changelog.gz \
    ./usr/share/doc/mosquitto/copyright \
    ./usr/share/doc/mosquitto/examples/aclfile.example \
    ./usr/share/doc/mosquitto/examples/mosquitto.conf.gz \
    ./usr/share/doc/mosquitto/examples/pskfile.example \
    ./usr/share/doc/mosquitto/examples/pwfile.example \
    ./usr/share/doc/mosquitto/readme.txt \
    ./usr/share/man/man1/mosquitto_passwd.1.gz \
    ./usr/share/man/man5/mosquitto.conf.5.gz \
    ./usr/share/man/man7/mosquitto-tls.7.gz \
    ./usr/share/man/man7/mqtt.7.gz \
    ./usr/share/man/man8/mosquitto.8.gz\
"
