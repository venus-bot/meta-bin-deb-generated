PACKAGES = "${PN} libp11-kit0"
PROVIDES = "libp11-kit0"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/p/p11-kit/libp11-kit0_0.20.7-1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libp11-kit0 = "libp11-kit0_0.20.7-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "70b3358352e793bc0e78cde9d8edd2e9c89ae3ec29b664c639544ac8bd6d984d"
SRC_URI[deb0.md5sum] = "3e10fe21789f145b492178eb80e6d07c"

RDEPENDS_lib${PN}0 = "libc6 (>= 2.16) libffi6 (>= 3.0.4)"
DEPENDS = "libc6 libffi6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libp11-kit0 = " \
    ./usr/lib/arm-linux-gnueabihf/libp11-kit.so.0 \
    ./usr/lib/arm-linux-gnueabihf/libp11-kit.so.0.0.0 \
    ./usr/share/doc/libp11-kit0/changelog.Debian.gz \
    ./usr/share/doc/libp11-kit0/changelog.gz \
    ./usr/share/doc/libp11-kit0/copyright \
    ./usr/share/doc/libp11-kit0/examples/pkcs11.conf.example\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
