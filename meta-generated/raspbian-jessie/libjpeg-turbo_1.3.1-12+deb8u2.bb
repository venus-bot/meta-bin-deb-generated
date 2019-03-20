PACKAGES = "${PN} libjpeg62-turbo"
PROVIDES = "libjpeg62-turbo"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libj/libjpeg-turbo/libjpeg62-turbo_1.3.1-12+deb8u2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libjpeg62-turbo = "libjpeg62-turbo_1.3.1-12+deb8u2_armhf.deb"
SRC_URI[deb0.sha256sum] = "0cafa6aec2723ab77e43aae52df1017463b389d2b3533f0ff48456edabd217f9"
SRC_URI[deb0.md5sum] = "9e9dd66d826ceb90917523d9318d2adc"

RDEPENDS_libjpeg62-turbo = "libc6 (>= 2.7)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libjpeg62-turbo = " \
    ./usr/lib/arm-linux-gnueabihf/libjpeg.so.62 \
    ./usr/lib/arm-linux-gnueabihf/libjpeg.so.62.1.0 \
    ./usr/share/doc/libjpeg62-turbo/changelog.Debian.gz \
    ./usr/share/doc/libjpeg62-turbo/changelog.gz \
    ./usr/share/doc/libjpeg62-turbo/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
