PACKAGES = "libsystemd0"
PROVIDES = "libsystemd0"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/s/systemd/libsystemd0_215-17+deb8u6_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libsystemd0 = "libsystemd0_215-17+deb8u6_armhf.deb"
SRC_URI[deb0.sha256sum] = "3903d5da2a6c2b74aab4ca0651436ee74ed414a6e9d34cc7a8474ff0de21b69d"
SRC_URI[deb0.md5sum] = "9725ed30720e14bd84aba9bd472905c2"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libsystemd0 = " \
	./lib/arm-linux-gnueabihf/libsystemd.so.0 \
	./lib/arm-linux-gnueabihf/libsystemd.so.0.3.1 \
	./usr/share/doc/libsystemd0/changelog.Debian.gz \
	./usr/share/doc/libsystemd0/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
