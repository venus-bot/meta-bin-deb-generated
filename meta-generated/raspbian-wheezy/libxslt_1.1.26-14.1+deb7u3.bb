PACKAGES = "libxslt1.1"
PROVIDES = "libxslt1.1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libx/libxslt/libxslt1.1_1.1.26-14.1+deb7u3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libxslt1.1 = "libxslt1.1_1.1.26-14.1+deb7u3_armhf.deb"
SRC_URI[deb0.sha256sum] = "6e140f7d56b27927ee7c0558768ec22fc2eff1b82b2f07a7f3c2f506da472aac"
SRC_URI[deb0.md5sum] = "d62ac4b241f5cd1caba535abac85ef4e"

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