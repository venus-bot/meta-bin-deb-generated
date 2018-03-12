PACKAGES = "${PN} libdebconfclient0"
PROVIDES = "libdebconfclient0"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/c/cdebconf/libdebconfclient0_0.192_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libdebconfclient0 = "libdebconfclient0_0.192_armhf.deb"
SRC_URI[deb0.sha256sum] = "3769bd43beea15e7df1f9829f0c4da47aa1826ba0c30f96c494ca20cdcd8e84f"
SRC_URI[deb0.md5sum] = "8545e1ae27938d7276d3aa129dbba39c"

RDEPENDS_libdebconfclient0 = "libc6 (>= 2.4)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libdebconfclient0 = " \
    ./usr/lib/arm-linux-gnueabihf/libdebconfclient.so.0 \
    ./usr/lib/arm-linux-gnueabihf/libdebconfclient.so.0.0.0 \
    ./usr/share/doc/libdebconfclient0/changelog.gz \
    ./usr/share/doc/libdebconfclient0/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
