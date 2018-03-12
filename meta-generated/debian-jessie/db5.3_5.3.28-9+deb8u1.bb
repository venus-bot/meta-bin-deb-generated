PACKAGES = "${PN} libdb5.3"
PROVIDES = "libdb5.3"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/d/db5.3/libdb5.3_5.3.28-9+deb8u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libdb5.3 = "libdb5.3_5.3.28-9+deb8u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "5dabb76dc80a3d9ddc0a0167f647e14078fa55a865e9f925250c4654db358891"
SRC_URI[deb0.md5sum] = "6ae671811b4d8534801cf6adcdcc6a98"

RDEPENDS_lib${PN} = "libc6 (>= 2.17)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libdb5.3 = " \
    ./usr/share/lintian/overrides/libdb5.3 \
    ./usr/lib/arm-linux-gnueabihf/libdb-5.3.so \
    ./usr/share/doc/libdb5.3/build_signature_armhf.txt \
    ./usr/share/doc/libdb5.3/changelog.Debian.gz \
    ./usr/share/doc/libdb5.3/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
