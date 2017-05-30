PACKAGES = "mosquitto"
PROVIDES = "mosquitto"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/m/mosquitto/mosquitto_0.15-2+deb7u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_mosquitto = "mosquitto_0.15-2+deb7u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "8ab590f74e4b84db11e288571aac657451c1367eafe4a9889229359c40e86e7c"
SRC_URI[deb0.md5sum] = "4b55d8b13d9e94906a0cf7a576bfd5f2"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0) libwrap0 (>= 7.6-4~) adduser (>= 3.10) lsb-base (>= 3.2-13)"
DEPENDS = "libgcc1 libwrap0 adduser lsb-base libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/share/man/man8/mosquitto.8.gz \
	./usr/share/doc/mosquitto/compiling.txt \
	./usr/share/doc/mosquitto/readme.txt \
	./usr/share/doc/mosquitto/changelog.Debian.gz \
	./usr/share/doc/mosquitto/changelog.gz \
	./etc/init.d/mosquitto \
	./usr/share/man/man5/mosquitto.conf.5.gz \
	./etc/mosquitto/mosquitto.conf \
	./usr/sbin/mosquitto \
	./usr/share/man/man7/mqtt.7.gz \
	./usr/share/doc/mosquitto/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
