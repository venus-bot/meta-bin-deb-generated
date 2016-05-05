PACKAGES = "libsqlite3-0"
PROVIDES = "libsqlite3-0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/s/sqlite3/libsqlite3-0_3.8.7.1-1+deb8u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libsqlite3-0 = "libsqlite3-0_3.8.7.1-1+deb8u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "afb6845c92025546d4de6e2db65e7b0deb86202240d570ed425390ecace1811b"
SRC_URI[deb0.md5sum] = "4c70a10736fcc54fa8eafc02ae1dd2e9"

RDEPENDS_lib${PN}-0 = "libc6 (>= 2.4)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libsqlite3-0 = " \
	./usr/lib/arm-linux-gnueabihf/libsqlite3.so.0.8.6 \
	./usr/share/doc/libsqlite3-0/changelog.html.gz \
	./usr/share/doc/libsqlite3-0/README.Debian \
	./usr/lib/arm-linux-gnueabihf/libsqlite3.so.0 \
	./usr/share/doc/libsqlite3-0/copyright \
	./usr/share/doc/libsqlite3-0/changelog.gz \
	./usr/share/doc/libsqlite3-0/changelog.Debian.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
