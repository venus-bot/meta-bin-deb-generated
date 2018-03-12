PACKAGES = "${PN} libsqlite3-0"
PROVIDES = "libsqlite3-0"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/s/sqlite3/libsqlite3-0_3.8.7.1-1+deb8u2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libsqlite3-0 = "libsqlite3-0_3.8.7.1-1+deb8u2_armhf.deb"
SRC_URI[deb0.sha256sum] = "332e2eb910d909ff6a77a9f1457744a1fe33b4626c5504b14b406e41f265c4be"
SRC_URI[deb0.md5sum] = "3b19c2973fee0368f6613e520a49f1a5"

RDEPENDS_lib${PN}-0 = "libc6 (>= 2.4)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libsqlite3-0 = " \
    ./usr/share/doc/libsqlite3-0/README.Debian \
    ./usr/share/doc/libsqlite3-0/changelog.gz \
    ./usr/share/doc/libsqlite3-0/copyright \
    ./usr/lib/arm-linux-gnueabihf/libsqlite3.so.0.8.6 \
    ./usr/share/doc/libsqlite3-0/changelog.Debian.gz \
    ./usr/share/doc/libsqlite3-0/changelog.html.gz \
    ./usr/lib/arm-linux-gnueabihf/libsqlite3.so.0\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
