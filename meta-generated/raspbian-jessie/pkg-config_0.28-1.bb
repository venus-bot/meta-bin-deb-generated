PACKAGES = "pkg-config"
PROVIDES = "pkg-config"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/p/pkg-config/pkg-config_0.28-1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_pkg-config = "pkg-config_0.28-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "b9d7cb9970cf58351b9252cff90410d09f2c75e0a53dab4490e7062e55126a7a"
SRC_URI[deb0.md5sum] = "76e5ae5585f03d797e6efed5d87f75dc"

RDEPENDS_${PN} = "libc6 (>= 2.4) libglib2.0-0 (>= 2.16.0)"
DEPENDS = "libglib2.0-0 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/share/doc/pkg-config/changelog.Debian.gz \
	./usr/share/pkg-config-crosswrapper \
	./usr/share/doc/pkg-config/AUTHORS \
	./usr/bin/arm-unknown-linux-gnueabihf-pkg-config \
	./usr/share/aclocal/pkg.m4 \
	./usr/share/doc/pkg-config/copyright \
	./usr/share/man/man1/pkg-config.1.gz \
	./usr/bin/pkg-config \
	./usr/share/doc/pkg-config/NEWS.gz \
	./usr/share/doc/pkg-config/changelog.gz \
	./usr/share/doc/pkg-config/README \
	./usr/share/doc/pkg-config/pkg-config-guide.html\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
