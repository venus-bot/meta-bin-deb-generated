PACKAGES = "mosquitto"
PROVIDES = "mosquitto"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/m/mosquitto/mosquitto_0.15-2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_mosquitto = "mosquitto_0.15-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "e997bd6a0f6fe11ce38bc60f1399185ae794e69e208c0019d5c8d15b3dad7c11"
SRC_URI[deb0.md5sum] = "0b2d4df47045b7a851d4c6f0d43fe909"

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
