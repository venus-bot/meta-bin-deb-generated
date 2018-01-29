PACKAGES = "libtiff4"
PROVIDES = "libtiff4"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/t/tiff3/libtiff4_3.9.6-11+deb7u9_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libtiff4 = "libtiff4_3.9.6-11+deb7u9_armhf.deb"
SRC_URI[deb0.sha256sum] = "c920ec174ac58ac21a8518ecab956b509ebcc1a79cae39f3f4fc41437d38f86d"
SRC_URI[deb0.md5sum] = "51079c160e8e7d0ef6f1ee452b8f312a"

RDEPENDS_libtiff4 = "libc6 (>= 2.13-28) libjbig0 libjpeg8 (>= 8c) zlib1g (>= 1:1.1.4)"
DEPENDS = "zlib1g libjbig0 libjpeg8 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libtiff4 = " \
	./usr/share/doc/libtiff4/README.Debian \
	./usr/share/doc/libtiff4/TODO \
	./usr/share/doc/libtiff4/changelog.gz \
	./usr/share/lintian/overrides/libtiff4 \
	./usr/share/doc/libtiff4/copyright \
	./usr/lib/arm-linux-gnueabihf/libtiff.so.4 \
	./usr/share/doc/libtiff4/changelog.Debian.gz \
	./usr/share/doc/libtiff4/README \
	./usr/lib/arm-linux-gnueabihf/libtiff.so.4.3.6\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
