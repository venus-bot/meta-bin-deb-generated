PACKAGES = "${PN} mosquitto"
PROVIDES = "mosquitto"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/m/mosquitto/mosquitto_1.5.7-1+deb10u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_mosquitto = "mosquitto_1.5.7-1+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "a0023d9d1bd90db1e2f4e329f8b2c681107bbee8bbdf3dd4f41948be5abedfe9"
SRC_URI[deb0.md5sum] = "1e37bff77bb96793a0f5ed6f5d544452"

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
