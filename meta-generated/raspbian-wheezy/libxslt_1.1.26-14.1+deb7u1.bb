PACKAGES = "libxslt1.1"
PROVIDES = "libxslt1.1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libx/libxslt/libxslt1.1_1.1.26-14.1+deb7u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libxslt1.1 = "libxslt1.1_1.1.26-14.1+deb7u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "4e06480909ab00a15090876b717d75119b9df8c565797ff619a93bea9a2f900e"
SRC_URI[deb0.md5sum] = "d58b14dba989ab2d7c8a7b73600169bd"

RDEPENDS_${PN}1.1 = "libc6 (>= 2.13-28) libgcrypt11 (>= 1.4.5) libxml2 (>= 2.7.4)"
DEPENDS = "libxml2 libgcrypt11 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libxslt1.1 = " \
	./usr/share/doc/libxslt1.1/changelog.gz \
	./usr/lib/arm-linux-gnueabihf/libxslt.so.1.1.26 \
	./usr/share/doc/libxslt1.1/changelog.Debian.gz \
	./usr/share/doc/libxslt1.1/README.Debian \
	./usr/lib/arm-linux-gnueabihf/libexslt.so.0 \
	./usr/share/doc/libxslt1.1/README \
	./usr/share/doc/libxslt1.1/copyright \
	./usr/share/doc/libxslt1.1/TODO.Debian \
	./usr/share/lintian/overrides/libxslt1.1 \
	./usr/share/doc/libxslt1.1/NEWS.gz \
	./usr/share/doc/libxslt1.1/TODO \
	./usr/share/doc/libxslt1.1/FEATURES.gz \
	./usr/lib/arm-linux-gnueabihf/libxslt.so.1 \
	./usr/share/doc/libxslt1.1/AUTHORS \
	./usr/lib/arm-linux-gnueabihf/libexslt.so.0.8.15\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
