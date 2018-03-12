PACKAGES = "${PN} libjpeg8"
PROVIDES = "libjpeg8"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libj/libjpeg8/libjpeg8_8d1-2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libjpeg8 = "libjpeg8_8d1-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "49d2fe4c59da942590e51072ddc1f725ae8d07e64f64784de4185e12921e7c21"
SRC_URI[deb0.md5sum] = "52e3915f4bec97bfeb749120a8eeb9b9"

RDEPENDS_${PN} = "libc6 (>= 2.7)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
    ./usr/share/doc/libjpeg8/README.8d1 \
    ./usr/lib/arm-linux-gnueabihf/libjpeg.so.8.4.0 \
    ./usr/lib/arm-linux-gnueabihf/libjpeg.so.8 \
    ./usr/share/doc/libjpeg8/changelog.gz \
    ./usr/share/doc/libjpeg8/changelog.Debian.gz \
    ./usr/share/doc/libjpeg8/README.gz \
    ./usr/share/doc/libjpeg8/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
