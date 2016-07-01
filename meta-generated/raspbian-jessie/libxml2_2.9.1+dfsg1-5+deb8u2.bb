PACKAGES = "libxml2"
PROVIDES = "libxml2"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libx/libxml2/libxml2_2.9.1+dfsg1-5+deb8u2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libxml2 = "libxml2_2.9.1+dfsg1-5+deb8u2_armhf.deb"
SRC_URI[deb0.sha256sum] = "eda25ae7b1726512a6fa2594bb848c6dc29c0d032c21239a1b9bc2fb09631e1a"
SRC_URI[deb0.md5sum] = "76028878e07f67e948eaba8b2f34e7bb"

RDEPENDS_${PN} = "libc6 (>= 2.15) liblzma5 (>= 5.1.1alpha+20120614) zlib1g (>= 1:1.2.3.3)"
DEPENDS = "liblzma5 zlib1g libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/share/doc/libxml2/README \
	./usr/lib/arm-linux-gnueabihf/libxml2.so.2.9.1 \
	./usr/share/doc/libxml2/copyright \
	./usr/share/lintian/overrides/libxml2 \
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
