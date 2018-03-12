PACKAGES = "${PN} libgmp10"
PROVIDES = "libgmp10"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/g/gmp/libgmp10_6.0.0+dfsg-6_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libgmp10 = "libgmp10_6.0.0+dfsg-6_armhf.deb"
SRC_URI[deb0.sha256sum] = "a3eb58a46f59a2707839714df65d1c79d5a600de129049d2314c27e5ebbea24c"
SRC_URI[deb0.md5sum] = "4daf6063a69937ab3e6dc1141bc11359"

RDEPENDS_lib${PN}10 = "libc6 (>= 2.7)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libgmp10 = " \
    ./usr/share/doc/libgmp10/copyright \
    ./usr/share/doc/libgmp10/README.Debian \
    ./usr/lib/arm-linux-gnueabihf/libgmp.so.10.2.0 \
    ./usr/lib/arm-linux-gnueabihf/libgmp.so.10 \
    ./usr/share/doc/libgmp10/changelog.Debian.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
