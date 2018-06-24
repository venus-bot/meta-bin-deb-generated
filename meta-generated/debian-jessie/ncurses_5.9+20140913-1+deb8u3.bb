PACKAGES = "${PN} libncursesw5 libtinfo5"
PROVIDES = "libncursesw5 libtinfo5"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/n/ncurses/libncursesw5_5.9+20140913-1+deb8u3_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/n/ncurses/libtinfo5_5.9+20140913-1+deb8u3_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libncursesw5 = "libncursesw5_5.9+20140913-1+deb8u3_armhf.deb"
SRC_URI[deb0.sha256sum] = "ff4c69d5360a650f7c3c340539681decd92657ace115aaca4de49a060a53bacd"
SRC_URI[deb0.md5sum] = "b93eaee36d9c0ab06593d575c9027976"
DEBFILENAME_libtinfo5 = "libtinfo5_5.9+20140913-1+deb8u3_armhf.deb"
SRC_URI[deb1.sha256sum] = "f6707c065096d68afe74c02a8a3917a0140cdf6ff31dfecc76c6dc8bf3c56efe"
SRC_URI[deb1.md5sum] = "b66824f0db03b005492cbbe98c944ed4"

RDEPENDS_lib${PN}w5 = "libc6 (>= 2.15) libtinfo5 (= 5.9+20140913-1+deb8u3)"
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
