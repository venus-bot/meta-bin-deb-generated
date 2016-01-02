PACKAGES = "libjpeg62-turbo"
PROVIDES = "libjpeg62-turbo"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libj/libjpeg-turbo/libjpeg62-turbo_1.3.1-12_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libjpeg62-turbo = "libjpeg62-turbo_1.3.1-12_armhf.deb"
SRC_URI[deb0.sha256sum] = "edcc79e000da2e1908d9c0fad9153ba18521b908541f75baf8a9850d6838aa44"
SRC_URI[deb0.md5sum] = "5475b0800d4967a6ea5b03f251b46cdf"

RDEPENDS_libjpeg62-turbo = "libc6 (>= 2.7)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libjpeg62-turbo = " \
	./usr/share/doc/libjpeg62-turbo/copyright \
	./usr/lib/arm-linux-gnueabihf/libjpeg.so.62.1.0 \
	./usr/lib/arm-linux-gnueabihf/libjpeg.so.62 \
	./usr/share/doc/libjpeg62-turbo/changelog.Debian.gz \
	./usr/share/doc/libjpeg62-turbo/changelog.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
