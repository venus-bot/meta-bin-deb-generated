PACKAGES = "libxml2"
PROVIDES = "libxml2"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libx/libxml2/libxml2_2.8.0+dfsg1-7+wheezy6_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libxml2 = "libxml2_2.8.0+dfsg1-7+wheezy6_armhf.deb"
SRC_URI[deb0.sha256sum] = "d494855676125d935613bc23489ee15cd0b1fdf51ee5235b81a002c95543c6df"
SRC_URI[deb0.md5sum] = "2f502cebd540e1470ed845c312750707"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) liblzma5 (>= 5.1.1alpha+20120614) zlib1g (>= 1:1.2.3.3)"
DEPENDS = "liblzma5 zlib1g libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/share/doc/libxml2/README \
	./usr/share/doc/libxml2/copyright \
	./usr/share/lintian/overrides/libxml2 \
	./usr/lib/arm-linux-gnueabihf/libxml2.so.2.8.0 \
	./usr/share/doc/libxml2/AUTHORS \
	./usr/share/doc/libxml2/NEWS.gz \
	./usr/share/doc/libxml2/TODO.gz \
	./usr/share/doc/libxml2/changelog.Debian.gz \
	./usr/share/doc/libxml2/changelog.gz \
	./usr/share/doc/libxml2/README.Debian \
	./usr/lib/arm-linux-gnueabihf/libxml2.so.2\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
