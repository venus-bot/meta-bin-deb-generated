PACKAGES = "${PN} libbz2-1.0"
PROVIDES = "libbz2-1.0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/b/bzip2/libbz2-1.0_1.0.6-7_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libbz2-1.0 = "libbz2-1.0_1.0.6-7_armhf.deb"
SRC_URI[deb0.sha256sum] = "410c785d305d70a68d35e3e85df63de8e841e1393152511e7b98baefed30a755"
SRC_URI[deb0.md5sum] = "7a131fd8791675d1104b62c1940feaf1"

RDEPENDS_libbz2-1.0 = "libc6 (>= 2.4)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libbz2-1.0 = " \
    ./lib/arm-linux-gnueabihf/libbz2.so.1 \
    ./lib/arm-linux-gnueabihf/libbz2.so.1.0 \
    ./lib/arm-linux-gnueabihf/libbz2.so.1.0.4 \
    ./usr/share/doc/libbz2-1.0/changelog.Debian.gz \
    ./usr/share/doc/libbz2-1.0/changelog.gz \
    ./usr/share/doc/libbz2-1.0/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
