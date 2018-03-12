PACKAGES = "${PN} libpng12-0"
PROVIDES = "libpng12-0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libp/libpng/libpng12-0_1.2.50-2+deb8u3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libpng12-0 = "libpng12-0_1.2.50-2+deb8u3_armhf.deb"
SRC_URI[deb0.sha256sum] = "f9b99edc6c6f793661a11d714804999a7c87e2fbf8c4fd41ca750789f18cc18d"
SRC_URI[deb0.md5sum] = "daa907008c0e9e5f694ad98119a4a14b"

RDEPENDS_${PN}12-0 = "libc6 (>= 2.11) zlib1g (>= 1:1.1.4)"
DEPENDS = "libc6 zlib1g"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libpng12-0 = " \
    ./usr/share/doc/libpng12-0/KNOWNBUG \
    ./usr/share/doc/libpng12-0/README.Debian \
    ./usr/share/doc/libpng12-0/copyright \
    ./usr/share/doc/libpng12-0/ANNOUNCE \
    ./lib/arm-linux-gnueabihf/libpng12.so.0.50.0 \
    ./usr/share/doc/libpng12-0/changelog.Debian.gz \
    ./usr/lib/arm-linux-gnueabihf/libpng12.so.0 \
    ./usr/share/doc/libpng12-0/README.gz \
    ./usr/share/doc/libpng12-0/changelog.gz \
    ./usr/share/doc-base/libpng12 \
    ./usr/share/doc/libpng12-0/TODO \
    ./usr/share/doc/libpng12-0/libpng-1.2.50.txt.gz \
    ./lib/arm-linux-gnueabihf/libpng12.so.0\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
