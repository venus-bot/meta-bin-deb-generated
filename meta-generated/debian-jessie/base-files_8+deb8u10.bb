PACKAGES = "base-files"
PROVIDES = "base-files"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/b/base-files/base-files_8+deb8u10_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_base-files = "base-files_8+deb8u10_armhf.deb"
SRC_URI[deb0.sha256sum] = "b20d14a0e390b970c2467e43463a7a4e25d0996187e46383c654af83b6bfaa0d"
SRC_URI[deb0.md5sum] = "e2fd84d89c974e3976841abb7d850c1f"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/share/common-licenses/GFDL \
	./usr/share/base-files/staff-group-for-usr-local \
	./usr/share/common-licenses/Artistic \
	./usr/share/doc/base-files/FAQ \
	./usr/share/common-licenses/GFDL-1.2 \
	./usr/share/common-licenses/GFDL-1.3 \
	./usr/share/base-files/motd \
	./usr/share/doc/base-files/changelog.gz \
	./usr/share/base-files/dot.profile \
	./usr/share/base-files/profile \
	./etc/debian_version \
	./etc/issue.net \
	./usr/share/doc/base-files/README.FHS \
	./usr/share/doc/base-files/README \
	./etc/dpkg/origins/debian \
	./usr/share/common-licenses/GPL \
	./usr/share/base-files/nsswitch.conf \
	./usr/share/common-licenses/LGPL-3 \
	./usr/share/common-licenses/LGPL-2 \
	./usr/share/doc/base-files/copyright \
	./usr/share/common-licenses/GPL-1 \
	./usr/lib/os-release \
	./usr/share/common-licenses/GPL-3 \
	./etc/os-release \
	./usr/share/base-files/profile.md5sums \
	./usr/share/base-files/info.dir \
	./usr/share/common-licenses/GPL-2 \
	./usr/share/common-licenses/BSD \
	./usr/share/lintian/overrides/base-files \
	./usr/share/base-files/nsswitch.conf.md5sums \
	./etc/host.conf \
	./usr/share/base-files/dot.bashrc \
	./usr/share/common-licenses/LGPL \
	./etc/issue \
	./usr/share/common-licenses/Apache-2.0 \
	./usr/share/common-licenses/LGPL-2.1\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
