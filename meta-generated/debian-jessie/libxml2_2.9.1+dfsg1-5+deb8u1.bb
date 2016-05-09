PACKAGES = "libxml2"
PROVIDES = "libxml2"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libx/libxml2/libxml2_2.9.1+dfsg1-5+deb8u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libxml2 = "libxml2_2.9.1+dfsg1-5+deb8u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "49a3d1ef7e26e7dc58a45692e85ece9c9c95f69a62bd23b243c6fc8a3ffc62fb"
SRC_URI[deb0.md5sum] = "ad9af019970f21def72136ab1c2a1487"

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
	./usr/share/doc/libxml2/AUTHORS \
	./usr/share/doc/libxml2/copyright \
	./usr/share/lintian/overrides/libxml2 \
	./usr/share/doc/libxml2/changelog.gz \
	./usr/share/doc/libxml2/NEWS.gz \
	./usr/share/doc/libxml2/TODO.gz \
	./usr/share/doc/libxml2/changelog.Debian.gz \
	./usr/share/doc/libxml2/README.Debian \
	./usr/lib/arm-linux-gnueabihf/libxml2.so.2\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
