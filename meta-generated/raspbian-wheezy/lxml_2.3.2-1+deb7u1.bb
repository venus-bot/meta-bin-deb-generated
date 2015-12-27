PACKAGES = "python-lxml"
PROVIDES = "python-lxml"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/l/lxml/python-lxml_2.3.2-1+deb7u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_python-lxml = "python-lxml_2.3.2-1+deb7u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "7af1203ff4548df4cb1b82acba3e08dadd8c2c360a14b10df756c9c33be7fa5e"
SRC_URI[deb0.md5sum] = "4ebb96ebf6e4a67812b1058371fb15a7"

RDEPENDS_python-${PN} = "python (>= 2.6.6-7~) python (<< 2.8) libc6 (>= 2.13-28) libxml2 (>= 2.7.4) libxslt1.1 (>= 1.1.26) zlib1g (>= 1:1.1.4)"
DEPENDS = "python libxml2 zlib1g libxslt1.1 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_python-lxml = " \
	./usr/share/pyshared/lxml/usedoctest.py \
	./usr/lib/python2.7/dist-packages/lxml/doctestcompare.py \
	./usr/lib/python2.7/dist-packages/lxml/html/__init__.py \
	./usr/lib/python2.7/dist-packages/lxml-2.3.2.egg-info/dependency_links.txt \
	./usr/lib/python2.6/dist-packages/lxml/isoschematron/resources/xsl/iso-schematron-xslt1/iso_schematron_skeleton_for_xslt1.xsl \
	./usr/lib/python2.6/dist-packages/lxml/etree.so \
	./usr/share/pyshared/lxml/ElementInclude.py \
	./usr/share/pyshared/lxml/html/html5parser.py \
	./usr/lib/python2.6/dist-packages/lxml/usedoctest.py \
	./usr/share/pyshared/lxml/html/formfill.py \
	./usr/lib/python2.6/dist-packages/lxml/cssselect.py \
	./usr/lib/python2.7/dist-packages/lxml/isoschematron/resources/xsl/iso-schematron-xslt1/iso_schematron_skeleton_for_xslt1.xsl \
	./usr/lib/python2.6/dist-packages/lxml/isoschematron/resources/xsl/XSD2Schtrn.xsl \
	./usr/share/doc/python-lxml/CREDITS.txt \
	./usr/share/pyshared/lxml/html/ElementSoup.py \
	./usr/lib/python2.7/dist-packages/lxml/isoschematron/resources/xsl/RNG2Schtrn.xsl \
	./usr/lib/python2.7/dist-packages/lxml/html/defs.py \
	./usr/lib/python2.7/dist-packages/lxml/etree_defs.h \
	./usr/lib/python2.7/dist-packages/lxml/html/html5parser.py \
	./usr/lib/python2.6/dist-packages/lxml/html/clean.py \
	./usr/share/pyshared/lxml/isoschematron/resources/rng/iso-schematron.rng \
	./usr/lib/python2.6/dist-packages/lxml/html/usedoctest.py \
	./usr/share/doc/python-lxml/examples/simple.xml \
	./usr/share/doc/python-lxml/changelog.Debian.gz \
	./usr/lib/python2.7/dist-packages/lxml/objectify.so \
	./usr/lib/python2.6/dist-packages/lxml/tree.pxd \
	./usr/share/pyshared/lxml/isoschematron/resources/xsl/iso-schematron-xslt1/readme.txt \
	./usr/lib/python2.6/dist-packages/lxml/isoschematron/resources/xsl/iso-schematron-xslt1/readme.txt \
	./usr/lib/python2.6/dist-packages/lxml/doctestcompare.py \
	./usr/lib/python2.7/dist-packages/lxml/isoschematron/resources/xsl/XSD2Schtrn.xsl \
	./usr/lib/python2.6/dist-packages/lxml/html/diff.py \
	./usr/share/pyshared/lxml/tree.pxd \
	./usr/lib/python2.6/dist-packages/lxml/__init__.py \
	./usr/lib/python2.7/dist-packages/lxml/ElementInclude.py \
	./usr/share/pyshared/lxml/pyclasslookup.py \
	./usr/lib/pyshared/python2.7/lxml/etree.so \
	./usr/lib/python2.7/dist-packages/lxml/builder.py \
	./usr/lib/python2.7/dist-packages/lxml-2.3.2.egg-info/PKG-INFO \
	./usr/share/pyshared/lxml/_elementpath.py \
	./usr/lib/python2.6/dist-packages/lxml/sax.py \
	./usr/lib/python2.7/dist-packages/lxml/html/_html5builder.py \
	./usr/lib/python2.6/dist-packages/lxml/isoschematron/resources/xsl/iso-schematron-xslt1/iso_dsdl_include.xsl \
	./usr/lib/python2.6/dist-packages/lxml-2.3.2.egg-info/SOURCES.txt \
	./usr/lib/python2.7/dist-packages/lxml/sax.py \
	./usr/share/pyshared/lxml/doctestcompare.py \
	./usr/share/pyshared/lxml-2.3.2.egg-info/top_level.txt \
	./usr/lib/python2.7/dist-packages/lxml/usedoctest.py \
	./usr/share/pyshared/lxml/html/__init__.py \
	./usr/share/pyshared/lxml/isoschematron/resources/xsl/iso-schematron-xslt1/iso_schematron_skeleton_for_xslt1.xsl \
	./usr/lib/python2.6/dist-packages/lxml-2.3.2.egg-info/PKG-INFO \
	./usr/lib/python2.7/dist-packages/lxml-2.3.2.egg-info/not-zip-safe \
	./usr/share/pyshared/lxml/isoschematron/resources/xsl/iso-schematron-xslt1/iso_abstract_expand.xsl \
	./usr/lib/python2.6/dist-packages/lxml/html/defs.py \
	./usr/lib/python2.7/dist-packages/lxml/html/usedoctest.py \
	./usr/lib/python2.6/dist-packages/lxml/isoschematron/resources/xsl/RNG2Schtrn.xsl \
	./usr/lib/python2.7/dist-packages/lxml/html/formfill.py \
	./usr/lib/python2.7/dist-packages/lxml/isoschematron/resources/xsl/iso-schematron-xslt1/iso_schematron_message.xsl \
	./usr/lib/python2.7/dist-packages/lxml/html/diff.py \
	./usr/lib/python2.7/dist-packages/lxml/pyclasslookup.py \
	./usr/lib/python2.7/dist-packages/lxml/html/ElementSoup.py \
	./usr/lib/python2.7/dist-packages/lxml/html/soupparser.py \
	./usr/lib/pyshared/python2.6/lxml/objectify.so \
	./usr/share/pyshared/lxml/html/_html5builder.py \
	./usr/lib/python2.7/dist-packages/lxml/__init__.py \
	./usr/lib/python2.7/dist-packages/lxml/isoschematron/resources/xsl/iso-schematron-xslt1/iso_svrl_for_xslt1.xsl \
	./usr/share/pyshared/lxml/builder.py \
	./usr/lib/python2.7/dist-packages/lxml/isoschematron/resources/xsl/iso-schematron-xslt1/readme.txt \
	./usr/lib/python2.6/dist-packages/lxml-2.3.2.egg-info/not-zip-safe \
	./usr/lib/python2.6/dist-packages/lxml/objectify.so \
	./usr/lib/python2.6/dist-packages/lxml/etree_defs.h \
	./usr/share/pyshared/lxml/html/usedoctest.py \
	./usr/lib/pyshared/python2.6/lxml/etree.so \
	./usr/share/doc/python-lxml/changelog.gz \
	./usr/share/pyshared/lxml/html/soupparser.py \
	./usr/share/doc/python-lxml/TODO.txt \
	./usr/lib/python2.6/dist-packages/lxml/isoschematron/resources/xsl/iso-schematron-xslt1/iso_abstract_expand.xsl \
	./usr/lib/python2.7/dist-packages/lxml/_elementpath.py \
	./usr/lib/python2.7/dist-packages/lxml-2.3.2.egg-info/top_level.txt \
	./usr/lib/python2.6/dist-packages/lxml/isoschematron/__init__.py \
	./usr/lib/python2.6/dist-packages/lxml/html/_diffcommand.py \
	./usr/lib/python2.6/dist-packages/lxml/html/_dictmixin.py \
	./usr/share/pyshared/lxml-2.3.2.egg-info/PKG-INFO \
	./usr/lib/pyshared/python2.7/lxml/objectify.so \
	./usr/lib/python2.7/dist-packages/lxml/etree.so \
	./usr/lib/python2.6/dist-packages/lxml-2.3.2.egg-info/top_level.txt \
	./usr/lib/python2.7/dist-packages/lxml/tree.pxd \
	./usr/lib/python2.7/dist-packages/lxml/html/builder.py \
	./usr/share/pyshared/lxml/html/_diffcommand.py \
	./usr/share/pyshared/lxml/isoschematron/resources/xsl/RNG2Schtrn.xsl \
	./usr/lib/python2.6/dist-packages/lxml/_elementpath.py \
	./usr/lib/python2.6/dist-packages/lxml/etreepublic.pxd \
	./usr/lib/python2.6/dist-packages/lxml/ElementInclude.py \
	./usr/lib/python2.6/dist-packages/lxml/builder.py \
	./usr/lib/python2.6/dist-packages/lxml/pyclasslookup.py \
	./usr/lib/python2.6/dist-packages/lxml/isoschematron/resources/xsl/iso-schematron-xslt1/iso_svrl_for_xslt1.xsl \
	./usr/share/pyshared/lxml/html/_setmixin.py \
	./usr/lib/python2.6/dist-packages/lxml/html/html5parser.py \
	./usr/share/pyshared/lxml/sax.py \
	./usr/share/pyshared/lxml/isoschematron/resources/xsl/XSD2Schtrn.xsl \
	./usr/lib/python2.7/dist-packages/lxml/isoschematron/resources/xsl/iso-schematron-xslt1/iso_dsdl_include.xsl \
	./usr/share/pyshared/lxml/html/_dictmixin.py \
	./usr/lib/python2.6/dist-packages/lxml/html/soupparser.py \
	./usr/share/doc/python-lxml/copyright \
	./usr/share/pyshared/lxml/html/defs.py \
	./usr/share/pyshared/lxml/isoschematron/__init__.py \
	./usr/share/pyshared/lxml/isoschematron/resources/xsl/iso-schematron-xslt1/iso_svrl_for_xslt1.xsl \
	./usr/lib/python2.7/dist-packages/lxml/cssselect.py \
	./usr/lib/python2.7/dist-packages/lxml/html/_diffcommand.py \
	./usr/share/pyshared/lxml/etree_defs.h \
	./usr/lib/python2.7/dist-packages/lxml/html/_dictmixin.py \
	./usr/lib/python2.6/dist-packages/lxml/html/_setmixin.py \
	./usr/share/pyshared/lxml/etreepublic.pxd \
	./usr/lib/python2.7/dist-packages/lxml/html/clean.py \
	./usr/share/pyshared/lxml/html/clean.py \
	./usr/lib/python2.7/dist-packages/lxml/html/_setmixin.py \
	./usr/lib/python2.6/dist-packages/lxml/html/builder.py \
	./usr/lib/python2.6/dist-packages/lxml/html/formfill.py \
	./usr/lib/python2.7/dist-packages/lxml-2.3.2.egg-info/SOURCES.txt \
	./usr/lib/python2.7/dist-packages/lxml/isoschematron/resources/xsl/iso-schematron-xslt1/iso_abstract_expand.xsl \
	./usr/share/doc/python-lxml/examples/simple-ns.xml \
	./usr/share/pyshared/lxml/__init__.py \
	./usr/share/pyshared/lxml/isoschematron/resources/xsl/iso-schematron-xslt1/iso_schematron_message.xsl \
	./usr/lib/python2.6/dist-packages/lxml-2.3.2.egg-info/dependency_links.txt \
	./usr/share/pyshared/lxml-2.3.2.egg-info/SOURCES.txt \
	./usr/share/pyshared/lxml-2.3.2.egg-info/dependency_links.txt \
	./usr/lib/python2.6/dist-packages/lxml/html/_html5builder.py \
	./usr/share/pyshared/lxml/html/diff.py \
	./usr/share/doc/python-lxml/README.txt \
	./usr/lib/python2.6/dist-packages/lxml/html/ElementSoup.py \
	./usr/lib/python2.6/dist-packages/lxml/isoschematron/resources/xsl/iso-schematron-xslt1/iso_schematron_message.xsl \
	./usr/lib/python2.6/dist-packages/lxml/html/__init__.py \
	./usr/share/pyshared/lxml/isoschematron/resources/xsl/iso-schematron-xslt1/iso_dsdl_include.xsl \
	./usr/lib/python2.6/dist-packages/lxml/isoschematron/resources/rng/iso-schematron.rng \
	./usr/lib/python2.7/dist-packages/lxml/isoschematron/__init__.py \
	./usr/lib/python2.7/dist-packages/lxml/isoschematron/resources/rng/iso-schematron.rng \
	./usr/lib/python2.7/dist-packages/lxml/etreepublic.pxd \
	./usr/share/pyshared/lxml/cssselect.py \
	./usr/share/pyshared/lxml/html/builder.py \
	./usr/share/pyshared/lxml-2.3.2.egg-info/not-zip-safe\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
