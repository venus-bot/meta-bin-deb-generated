PACKAGES = "${PN} libproxy1"
PROVIDES = "libproxy1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libp/libproxy/libproxy1_0.4.11-4_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libproxy1 = "libproxy1_0.4.11-4_armhf.deb"
SRC_URI[deb0.sha256sum] = "44147bf259b5ceb8bb626af82adcb7295f4b6e7f860befc19c6b407c9b32dc1e"
SRC_URI[deb0.md5sum] = "d2b07a82b5d0e86f44be870f6e1d9a2a"

RDEPENDS_${PN}1 = "libc6 (>= 2.4) libgcc1 (>= 1:4.4.0) libstdc++6 (>= 4.4.0)"
DEPENDS = "libc6 libstdc++6 libgcc1"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libproxy1 = " \
    ./usr/lib/arm-linux-gnueabihf/libproxy.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libproxy.so.1.0.0 \
    ./usr/share/doc/libproxy1/changelog.Debian.gz \
    ./usr/share/doc/libproxy1/changelog.gz \
    ./usr/share/doc/libproxy1/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
