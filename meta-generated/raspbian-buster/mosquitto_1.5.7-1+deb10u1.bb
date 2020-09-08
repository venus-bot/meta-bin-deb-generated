PACKAGES = "${PN} mosquitto"
PROVIDES = "mosquitto"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/m/mosquitto/mosquitto_1.5.7-1+deb10u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_mosquitto = "mosquitto_1.5.7-1+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "6484e8dc1e4bee1a2d8656d0d2069c407f7589c27d3eee8678f9e7f1194eea2c"
SRC_URI[deb0.md5sum] = "2964507703ed2ffbd63b9e05e1b5c178"

RDEPENDS_${PN} = "adduser (>= 3.10) libc6 (>= 2.28) libssl1.1 (>= 1.1.0) libsystemd0 libuuid1 (>= 2.16) libwebsockets8 (>= 1.6.0) libwrap0 (>= 7.6-4~) lsb-base (>= 4.1+Debian3)"
DEPENDS = "adduser libc6 libssl1.1 libsystemd0 libuuid1 libwebsockets8 libwrap0 lsb-base"


inherit deb_group

FILES_${PN} = " \
    ./etc/init.d/mosquitto \
    ./etc/logrotate.d/mosquitto \
    ./etc/mosquitto/ca_certificates/README \
    ./etc/mosquitto/certs/README \
    ./etc/mosquitto/conf.d/README \
    ./etc/mosquitto/mosquitto.conf \
    ./lib/systemd/system/mosquitto.service \
    ./usr/bin/mosquitto_passwd \
    ./usr/sbin/mosquitto \
    ./usr/share/doc/mosquitto/README.Debian \
    ./usr/share/doc/mosquitto/changelog.Debian.gz \
    ./usr/share/doc/mosquitto/changelog.gz \
    ./usr/share/doc/mosquitto/copyright \
    ./usr/share/doc/mosquitto/examples/aclfile.example \
    ./usr/share/doc/mosquitto/examples/mosquitto.conf.gz \
    ./usr/share/doc/mosquitto/examples/pskfile.example \
    ./usr/share/doc/mosquitto/examples/pwfile.example \
    ./usr/share/doc/mosquitto/readme.md \
    ./usr/share/man/man1/mosquitto_passwd.1.gz \
    ./usr/share/man/man5/mosquitto.conf.5.gz \
    ./usr/share/man/man7/mosquitto-tls.7.gz \
    ./usr/share/man/man7/mqtt.7.gz \
    ./usr/share/man/man8/mosquitto.8.gz\
"
