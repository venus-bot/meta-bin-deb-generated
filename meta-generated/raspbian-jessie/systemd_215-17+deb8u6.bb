PACKAGES = "libsystemd0"
PROVIDES = "libsystemd0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/s/systemd/libsystemd0_215-17+deb8u6_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libsystemd0 = "libsystemd0_215-17+deb8u6_armhf.deb"
SRC_URI[deb0.sha256sum] = "5aaeaa79805190a4f3b03da71132d229e868950e3ebb6bd61c81dead476acfb2"
SRC_URI[deb0.md5sum] = "73929ac8ca0bfc02fed48aa633ed8906"


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
