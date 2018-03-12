PACKAGES = "${PN} libjpeg62-turbo"
PROVIDES = "libjpeg62-turbo"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libj/libjpeg-turbo/libjpeg62-turbo_1.3.1-12_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libjpeg62-turbo = "libjpeg62-turbo_1.3.1-12_armhf.deb"
SRC_URI[deb0.sha256sum] = "c5a9c0806633da1457984b9e6aa82392f230ac19a81460996482391aec2fe988"
SRC_URI[deb0.md5sum] = "11e170ae2de7e8283627f1b0a49882b4"

RDEPENDS_libjpeg62-turbo = "libc6 (>= 2.7)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libjpeg62-turbo = " \
    ./usr/share/doc/libjpeg62-turbo/changelog.Debian.gz \
    ./usr/lib/arm-linux-gnueabihf/libjpeg.so.62 \
    ./usr/share/doc/libjpeg62-turbo/changelog.gz \
    ./usr/share/doc/libjpeg62-turbo/copyright \
    ./usr/lib/arm-linux-gnueabihf/libjpeg.so.62.1.0\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
