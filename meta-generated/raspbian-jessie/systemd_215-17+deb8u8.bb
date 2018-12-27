PACKAGES = "${PN} libsystemd0"
PROVIDES = "libsystemd0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/s/systemd/libsystemd0_215-17+deb8u8_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libsystemd0 = "libsystemd0_215-17+deb8u8_armhf.deb"
SRC_URI[deb0.sha256sum] = "1c72f80e0401d848642aa7b2877509ad518ac60b414ea29e1c8e0c7d104bb0e5"
SRC_URI[deb0.md5sum] = "b5750f8f5695c760a1283c0d374fdd54"


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
