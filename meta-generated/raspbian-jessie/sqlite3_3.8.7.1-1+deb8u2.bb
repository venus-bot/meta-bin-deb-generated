PACKAGES = "${PN} libsqlite3-0"
PROVIDES = "libsqlite3-0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/s/sqlite3/libsqlite3-0_3.8.7.1-1+deb8u2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libsqlite3-0 = "libsqlite3-0_3.8.7.1-1+deb8u2_armhf.deb"
SRC_URI[deb0.sha256sum] = "1fee583a865fc4abca4374c5d859c8277b1b0ca8bb05e7e1058b71666168c9ee"
SRC_URI[deb0.md5sum] = "5c97f7f7248d0b468cf9705b0db46690"

RDEPENDS_lib${PN}-0 = "libc6 (>= 2.4)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libsqlite3-0 = " \
    ./usr/lib/arm-linux-gnueabihf/libsqlite3.so.0.8.6 \
    ./usr/lib/arm-linux-gnueabihf/libsqlite3.so.0 \
    ./usr/share/doc/libsqlite3-0/changelog.html.gz \
    ./usr/share/doc/libsqlite3-0/README.Debian \
    ./usr/share/doc/libsqlite3-0/changelog.gz \
    ./usr/share/doc/libsqlite3-0/changelog.Debian.gz \
    ./usr/share/doc/libsqlite3-0/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
