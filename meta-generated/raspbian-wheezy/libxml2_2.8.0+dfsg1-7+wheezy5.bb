PACKAGES = "libxml2"
PROVIDES = "libxml2"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libx/libxml2/libxml2_2.8.0+dfsg1-7+wheezy5_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libxml2 = "libxml2_2.8.0+dfsg1-7+wheezy5_armhf.deb"
SRC_URI[deb0.sha256sum] = "f9254f6b42113c4f32adbc5d1dc405b498119849e821efa9e6e154e03fa19fd8"
SRC_URI[deb0.md5sum] = "25a2076bb9a48916f62abe27bf6e81ee"

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
