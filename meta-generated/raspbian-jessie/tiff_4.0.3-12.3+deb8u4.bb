PACKAGES = "libtiff5"
PROVIDES = "libtiff5"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/t/tiff/libtiff5_4.0.3-12.3+deb8u4_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libtiff5 = "libtiff5_4.0.3-12.3+deb8u4_armhf.deb"
SRC_URI[deb0.sha256sum] = "24f653bbdc19c151c87cd0e7faea0511e55aa1c6a8ebcd769af34a1e5eab75da"
SRC_URI[deb0.md5sum] = "828ab45d7b670624a2e7ab919065ff80"

RDEPENDS_lib${PN}5 = "libc6 (>= 2.11) libjbig0 (>= 2.0) libjpeg62-turbo (>= 1.3.1) liblzma5 (>= 5.1.1alpha+20120614) zlib1g (>= 1:1.1.4)"
DEPENDS = "liblzma5 libjbig0 zlib1g libjpeg62-turbo libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libtiff5 = " \
	./usr/share/doc/libtiff5/TODO \
	./usr/share/doc/libtiff5/README.Debian \
	./usr/share/doc/libtiff5/changelog.gz \
	./usr/share/lintian/overrides/libtiff5 \
	./usr/share/doc/libtiff5/changelog.Debian.gz \
	./usr/share/doc/libtiff5/README \
	./usr/lib/arm-linux-gnueabihf/libtiff.so.5 \
	./usr/lib/arm-linux-gnueabihf/libtiff.so.5.2.0 \
	./usr/share/doc/libtiff5/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
