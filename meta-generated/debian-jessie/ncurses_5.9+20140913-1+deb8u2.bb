PACKAGES = "${PN} libncursesw5 libtinfo5"
PROVIDES = "libncursesw5 libtinfo5"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/n/ncurses/libncursesw5_5.9+20140913-1+deb8u2_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/n/ncurses/libtinfo5_5.9+20140913-1+deb8u2_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libncursesw5 = "libncursesw5_5.9+20140913-1+deb8u2_armhf.deb"
SRC_URI[deb0.sha256sum] = "2c5277a24771e36a721050226c21df53141dfb9242b6174782770e8fa2c4a3b2"
SRC_URI[deb0.md5sum] = "a9e051e16bb02d1e61cd04e2a1fe441d"
DEBFILENAME_libtinfo5 = "libtinfo5_5.9+20140913-1+deb8u2_armhf.deb"
SRC_URI[deb1.sha256sum] = "ece08743d9d01ef0cd4206474893d2201128a0a11e0dff7505b51c862a0365b8"
SRC_URI[deb1.md5sum] = "62e2b80ddfde12886154f621464aea0c"

RDEPENDS_lib${PN}w5 = "libtinfo5 (= 5.9+20140913-1+deb8u2) libc6 (>= 2.15)"
RDEPENDS_libtinfo5 = "libc6 (>= 2.15)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libncursesw5 = " \
    ./lib/arm-linux-gnueabihf/libncursesw.so.5 \
    ./lib/arm-linux-gnueabihf/libncursesw.so.5.9 \
    ./usr/lib/arm-linux-gnueabihf/libformw.so.5 \
    ./usr/lib/arm-linux-gnueabihf/libformw.so.5.9 \
    ./usr/lib/arm-linux-gnueabihf/libmenuw.so.5 \
    ./usr/lib/arm-linux-gnueabihf/libmenuw.so.5.9 \
    ./usr/lib/arm-linux-gnueabihf/libpanelw.so.5 \
    ./usr/lib/arm-linux-gnueabihf/libpanelw.so.5.9 \
    ./usr/share/doc/libncursesw5\
"
FILES_libtinfo5 = " \
    ./lib/arm-linux-gnueabihf/libtinfo.so.5 \
    ./lib/arm-linux-gnueabihf/libtinfo.so.5.9 \
    ./usr/lib/arm-linux-gnueabihf/libtic.so.5 \
    ./usr/lib/arm-linux-gnueabihf/libtic.so.5.9 \
    ./usr/share/doc/libtinfo5/TODO.Debian \
    ./usr/share/doc/libtinfo5/changelog.Debian.gz \
    ./usr/share/doc/libtinfo5/changelog.gz \
    ./usr/share/doc/libtinfo5/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
